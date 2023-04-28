package co.edu.uptc.presenter;

public interface ContractPlanes {

    public interface View {
        void setPresenter(ContractPlanes.Presenter presenter);
        void start();

    }

    public interface Model {
        void setPresenter(ContractPlanes.Presenter presenter);

    }

    public interface Presenter {
        void setView(ContractPlanes.View view);
        void setModel(ContractPlanes.Model model);

    }
}