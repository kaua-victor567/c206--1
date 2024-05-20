
import java.io.*;
import java.util.ArrayList;


public class Arquivo {
    public static void escrever(Jogo jogo){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String line;

        try{
            os = new FileOutputStream("jogos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Flags
            bw.write("++ Jogo ++\n");
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getGenero() + "\n");
            bw.write(jogo.getPreco() + "\n");
        }
        catch(Exception e){
            System.out.println("ERRO: " + e);
        }
        finally{
            try{
                bw.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }



    public ArrayList<Jogo> ler() {
        ArrayList<Jogo> jogoo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String lineReader;

        try {
            is = new FileInputStream("Jogos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            lineReader = br.readLine();

            while (lineReader != null) {
                if(lineReader.contains("++ Jogo ++")){
                    Jogo jogoAux = new Jogo();


                    jogoAux.setNome(br.readLine());
                    jogoAux.setGenero(br.readLine());
                    jogoAux.setPreco(Integer.parseInt(br.readLine()));


                    jogoo.add(jogoAux);
                }
                lineReader = br.readLine();
            }
        }
        catch (Exception e) {
            System.out.println("ERRO: " + e);
        }
        finally {
            try {
                br.close();
            }
            catch (Exception e) {
                System.out.println("ERRO: " + e);
            }
        }
        return jogoo;
    }
}