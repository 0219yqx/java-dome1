package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class IODemo9 {
    public static void main(String[] args) throws IOException {
        FileReader fr =new FileReader("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo2");
        StringBuilder sb=new StringBuilder();
        int n;
        while ((n=fr.read())!=-1){
            sb.append((char)n);
        }
        fr.close();
        Integer[] arr= Arrays.stream(sb.toString().split("-")).map(String::trim).map(Integer::valueOf).sorted().toArray(Integer[]::new);
        FileWriter fw=new FileWriter("C:\\Users\\岳琪翔\\IdeaProjects\\dome1\\src\\IO\\IODemo2");
        String str=Arrays.toString(arr).replace(",","-");
        String result=str.substring(1,str.length()-1);
        fw.write(result);
        fw.close();
    }
}
