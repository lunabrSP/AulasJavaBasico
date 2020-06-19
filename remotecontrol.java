public class remotecontrol{
    public static void main(String args[]){
        televisao t;          // declaro a TV
        t = new televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.Marca = "Samsung";
        t.TamanhoTela = 42;
        t.ligada = false;
        t.canal = 5;
        t.volume = 10;

        televisao x = new televisao();
        x.Marca = "LG";
        x.TamanhoTela = 55;
        x.ligada = true;
        x.canal = 9;
        x.volume = 5;

        t.alteracanal(0);

        t.power();
        x.power();
        x.power();
        t.power();
        t.alteracanal(0);
        t.mute();
        x.alteravolume(0);

        t.mute();

        x.mute();
        t.power();
        t.alteracanal(0);
        t.alteracanal(0);
        t.alteracanal(0);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(1);
        t.alteracanal(0);

    }
}