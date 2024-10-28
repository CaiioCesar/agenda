import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    public JanelaPrincipal() {
        setTitle("Gerenciador de Contatos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inicializaMenu();
    }

    private void inicializaMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");
        JMenuItem menuItemCadastrar = new JMenuItem("Cadastrar Contato");
        JMenuItem menuItemPesquisar = new JMenuItem("Pesquisar Contato");
        JMenuItem menuItemRemover = new JMenuItem("Remover Contato");

        menu.add(menuItemCadastrar);
        menu.add(menuItemPesquisar);
        menu.add(menuItemRemover);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);
    }
}

