package IO;

import java.io.*;

public class IODemo12 {
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo12"))) {
            String line = br.readLine();
            if (line != null && !line.trim().isEmpty()) {
                count = Integer.parseInt(line);
            }
        } catch (FileNotFoundException e) {
            count = 0;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        count++;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo12"))){
            bw.write(String.valueOf(count));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(count<=3){
            System.out.println("欢迎使用本软件，第" + count + "次使用免费~");
        }else{
            System.out.println("对不起，你已经使用了" +3 +"次，请付费使用~");
        }
    }
}
