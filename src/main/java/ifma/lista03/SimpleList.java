package ifma.lista03;

public class SimpleList {
    Node head;
    Node tail;
    int size;
    
    public SimpleList(){
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public void adicionarInicio(int element){
        Node no = new Node(element);
        no.next = head;
        head = no;
        
        if(isEmpty()){
            tail = no;
        }
        size++;
    }
    
    public void adicionarFim(int element){
        if(isEmpty()){
            adicionarInicio(element);
        }else{
            Node no = new Node(element);
            no.next = null;
            tail.next = no;
            tail = no;
            size++;
        }
        
    }
    
    public int removerComeco(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        int temp = head.element;
        head = head.next;
        size--;
        return temp;
    }
    
    public int removerFinal(){
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        Node v = head;
        while(v.next != tail){
            v = v.next;
        }
        int temp = tail.element;
        tail = v;
        tail.next = null;
        size--;
        return temp;
    }
    
    public String toString(){
        if(isEmpty())
            return "[]";
        String s = "[" + head.element;
        
        Node node = head.next;
        while (node != null){
            s += ", " + node.element;
            node = node.next;
        }
        return s + "]";
    }
    
    public int maior(){
        int maior = head.element;
        Node node = head.next;
        while (node != null){
            if(node.element > maior)
                maior = node.element;
            node = node.next;
        }
        return maior;
    }
    
    public int menor(){
        int menor = head.element;
        Node node = head.next;
        while (node != null){
            if(node.element < menor)
                menor = node.element;
            node = node.next;
        }
        return menor;
    }
    
    public float media(){
        int count = 0, soma = 0;
        Node node = head;
        while (node != null){
            soma += node.element;
            count++;
            node = node.next;
        }
        return (float)soma/count;
    }
}
