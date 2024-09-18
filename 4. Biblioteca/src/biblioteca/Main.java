package biblioteca;

import biblioteca.Livro;
import biblioteca.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Livro livro = new Livro("O pereglino ","Jhon Bunyan","8550819883");
        Usuario usuario = new Usuario("israel","151.055.200-57");
        Usuario usuario1 = new Usuario("Rhafael","15100523473");
        usuario.emprestar(livro);
            System.out.println(livro);
    }
        }