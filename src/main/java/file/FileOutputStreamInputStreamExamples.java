package file;

import java.io.*;

// https://www.youtube.com/watch?v=zvi6U0VxbjE
public class FileOutputStreamInputStreamExamples {

    public static void main(String[] args) {
//        gravador();
//        leitor();
//        gravadorComBuffer();
        leitor();
    }

    private static void gravador() {
        byte[] dados = {65, 66, 67, 68, 69, 70};

        try (FileOutputStream fileOutputStream = new FileOutputStream("FilesExamples/stream.txt")) {
            fileOutputStream.write(dados);
            fileOutputStream.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        Com bufferedOutputStream a performance é melhor, isso é importante quando se trabalha com volume de dados grande.
     */
    private static void gravadorComBuffer() {
        byte[] dados = {65, 66, 67, 68, 69, 70};

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("FilesExamples/stream.txt")) ) {
            bufferedOutputStream.write(dados);
            bufferedOutputStream.flush();
            System.out.println("Dados gravados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitor() {
        try (FileInputStream fileInputStream = new FileInputStream("FilesExamples/stream.txt")) {
            int leitura;
            while( (leitura = fileInputStream.read()) != -1 ) {
                byte dado = (byte) leitura;
                System.out.print(" " + dado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Com bufferedOutputStream a performance é melhor, isso é importante quando se trabalha com volume de dados grande.
 */
    private static void leitorComBuffer() {
        byte[] dados = {65, 66, 67, 68, 69, 70};

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("FilesExamples/stream.txt")) ) {
            int leitura;
            while( (leitura = bufferedInputStream.read()) != -1 ) {
                byte dado = (byte) leitura;
                System.out.print(" " + dado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
