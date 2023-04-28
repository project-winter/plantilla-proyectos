package co.edu.uptc.presenter;

public class Presenter implements ContractPlanes.Presenter{

    private ContractPlanes.View view;
    private ContractPlanes.Model model;

    @Override
    public void setView(ContractPlanes.View view) {
        this.view = view;
    }

    @Override
    public void setModel(ContractPlanes.Model model) {
        this.model=model;
    }
}