package aula07;

public class Aula07 {
    public static void main(String[] args) {

        Lutador[] vetLutador = new Lutador[6];
        vetLutador[0] = new Lutador ("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        vetLutador[1] = new Lutador ("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        vetLutador[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        vetLutador[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        vetLutador[4] = new Lutador ("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        vetLutador[5] = new Lutador ("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        vetLutador[0].apresentar();
        vetLutador[0].status();
    }
}
