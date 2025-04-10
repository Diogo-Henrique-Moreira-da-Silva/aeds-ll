public class Fila {
    
    private Celula primeiro, ultimo;
    public Fila(){
        primeiro = new Celula();
        ultimo = primeiro;
    }
    public void inserir(int x){
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }
    public int remover(){
        if(ultimo==primeiro){
            try {
                throw new Exception("erro");
            } catch (Exception ex) {
            }
            Celula temp = primeiro;
            primeiro = primeiro.prox;
            int elemento = primeiro.elemento;
            temp.prox=null;
            temp=null;
            return elemento; //exclui a head e cpnsidera o proximo como head
        //{Celula temp = primeiro.prox.prox;
        //primeiro.prox.prox=null;
        //primeiro.prox= temp;
        //temp=null;} <--- Elimina o Elemento
        //primeiro.prox=primeiro.prox.prox; <---outra opção para remover o elemento//
        }
                return 0;
    }
    public void mostrar(){
    Celula atual = primeiro.prox; 
    while (atual != null) {
        System.out.print(atual.elemento + " - ");
        atual = atual.prox;
        }
    }    

    public void maior(){
        int maior = 0;
        for (Celula i = primeiro.prox; i != null; i=i.prox){
            
            if(i.elemento>maior){
                maior = i.elemento;
            }
        }
        System.out.print("maior:");
        System.out.print(maior);
    }

    public void terceiro(){
        int j = 0;
        for (Celula i = primeiro.prox; i != null; i=i.prox){
            j++;
            }
        if(j>=3){
            System.out.print(" Terceito: " + primeiro.prox.prox.prox.elemento);
        }
    }
    

    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.inserir(10);
        fila.inserir(4);
        fila.inserir(2);
        fila.inserir(17);
        fila.inserir(8);
        fila.mostrar();
        fila.maior();
        fila.terceiro();
    }}