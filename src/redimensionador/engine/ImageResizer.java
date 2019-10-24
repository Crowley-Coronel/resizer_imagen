package redimensionador.engine;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.String.valueOf;
import javax.imageio.ImageIO;

public class ImageResizer {

    private String pathImagen;
    private String pathFolderSalida;

    public void set_image_path(String _pathImagen) {
        pathImagen = _pathImagen;
        System.out.println("PATH IMAGEN SETEADO" + pathImagen);
    }

    public void set_folder_salida(String _pathFolderSalida) {
        pathFolderSalida = _pathFolderSalida;
        System.out.println("Path folder salida seteado" + _pathFolderSalida);
    }

    public void crop(int x, int y, int x2, int y2) throws IOException {
        File inputFile_crop = new File(pathImagen);
        int cropWidth = 200;
        int cropHeight = 200;
        BufferedImage inputImage_crop = ImageIO.read(inputFile_crop);
        BufferedImage croppedImage = inputImage_crop.getSubimage(x, y, x2, y2);
        File pathFile = new File(pathFolderSalida + "\\" + "image-crop.png");
        ImageIO.write(croppedImage, "png", pathFile);
    }

    public void redimenzionar() throws IOException {
        int scaledWidth = 1024;
        int scaledHeight = 768;
        File inputFile = new File(pathImagen);
        BufferedImage inputImage = ImageIO.read(inputFile);
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        String nombre_imagen = pathImagen.substring(pathImagen.lastIndexOf("\\") + 1);

        nombre_imagen = valueOf(scaledWidth) + "x" + valueOf(scaledHeight) + "_" + nombre_imagen;

        String outputImagePath = pathFolderSalida + "\\" + nombre_imagen;
        String formatName = outputImagePath.substring(outputImagePath
                .lastIndexOf(".") + 1);

        ImageIO.write(outputImage, formatName, new File(outputImagePath));
    }

    public static void resize(String inputImagePath,
            String outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        // reads input image
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);

        // creates output image
        BufferedImage outputImage = new BufferedImage(scaledWidth,
                scaledHeight, inputImage.getType());

        // scales the input image to the output image
        Graphics2D g2d = outputImage.createGraphics();
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        // extracts extension of output file
        String formatName = outputImagePath.substring(outputImagePath
                .lastIndexOf(".") + 1);

        // writes to output file
        ImageIO.write(outputImage, formatName, new File(outputImagePath));
    }

    public static void resize(String inputImagePath,
            String outputImagePath, double percent) throws IOException {
        File inputFile = new File(inputImagePath);
        BufferedImage inputImage = ImageIO.read(inputFile);
        int scaledWidth = (int) (inputImage.getWidth() * percent);
        int scaledHeight = (int) (inputImage.getHeight() * percent);
        resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
    }

}
