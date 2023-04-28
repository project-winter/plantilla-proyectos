package co.edu.uptc.views;

import co.edu.uptc.presenter.ContractPlanes;
import javax.swing.*;

public class PrincipalFrame extends JFrame implements ContractPlanes.View{

    ContractPlanes.Presenter presenter;

    public PrincipalFrame() {
        super("Sistema de facturadora");
        this.setSize(1000, 700);
        //initPanels();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        start();
        setEvents();
    }

    private void initPanels() {

    }

    @Override
    public void setPresenter(ContractPlanes.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        this.setVisible(true);
    }

    private void setEvents() {
       //pricinpalPanel.setEventsToNavBarPanel(this);
    }
}