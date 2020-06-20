package Counter;

public class Counter {
    int value = 0;
    int initialValue = 0;

    public Counter(int num){
        this.initialValue = num;
        this.value = num;
    }
    public Counter(){
    }

    public void add(int num){
        this.value += num;
    }
    public void add(){
        this.value +=1;
    }
    public int get(){
        return this.value;
    }
    public void reset(){
        this.value = this.initialValue;
    }
}
