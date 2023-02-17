
import menus.*;
import validarUsuario.ValidarAdm;
import validarUsuario.ValidarCliente;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcaoMenuInicial;

        do {
            MenuInicial.menuInicial();
            opcaoMenuInicial = sc.nextInt();
            if (opcaoMenuInicial == 1) {
                boolean abreMenuAdm = ValidarAdm.validaAdmLoginSenha(new AdmLogin(sc).loginAdm());
                if (abreMenuAdm) {
                    new MenuAdmClasseConcreta(sc).menuAdministrador();
                }
            }
            if (opcaoMenuInicial == 2) {
                boolean abreMenuCliente = ValidarCliente.validaClienteLoginSenha(new ClienteCadastro(sc).cadastroCliente(), new ClienteLogin(sc).loginCliente());
                if (abreMenuCliente) {
                    new MenuClienteClasseConcreta(sc).menuCliente();
                }
            }
        } while (opcaoMenuInicial != 0);
    }
}


