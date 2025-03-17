public interface ICommand {

    void execute(String instruction);
    void execute();
    void start();
    void accelerate();
    void brake();

}
