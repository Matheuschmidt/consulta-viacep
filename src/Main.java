
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        while(true) {
            System.out.print("Digite seu CEP: ");
            String busca = scanner.nextLine();
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(busca);
                System.out.println(novoEndereco);
                FileWriter writer = new FileWriter("arquivo.json");
                writer.write(gson.toJson(novoEndereco));
                writer.close();
            }catch (JsonSyntaxException e){
                System.out.println("Não foi possível interpretar os dados retornados pela API.");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
