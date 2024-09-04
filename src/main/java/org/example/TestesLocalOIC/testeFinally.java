package org.example.TestesLocalOIC;



import com.google.gson.JsonArray;

import java.io.IOException;

public class testeFinally {

    public static void main(String[] args) throws IOException, InterruptedException {

        // JsonArray newew = testeFif(5);
        StringBuilder nn = new StringBuilder();
        nn.append("uiuiui").append(";");
        nn.append("uiuiui").append(";");
        nn.append("popopo").append(";");

        for(String mayn : nn.toString().split(";")){

            System.out.println("TERMINOUU " + mayn);
        }
    }

    private static JsonArray testeFif(int i) {
        int cont= 0;
        try{
            cont= 9;

            System.out.println("TRY: " + cont);
            return new JsonArray();
        }catch (Exception e){
            System.out.println("CATCH" + cont);
            cont = 3;
        }finally {
            System.out.println("FINALLY" + cont);
        }

        return null;
    }


}
