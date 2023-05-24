package DSA.Algorithms;

public class  ArrayList<T> {
  private  T[] elements;
    int size;
    ArrayList(){
        this.elements = null;
    }
  
    public void add(T data){
      
        this.size++;
        T[] newArray;
        T[] oldArray;
        
        if (this.elements == null){
             newArray = ((T[]) new Object[1]);
             newArray[0] = data;
             this.elements = newArray;
         }
         else if (this.elements != null){
             // store the reference of current array into oldArray
             oldArray = this.elements;

             // create a new array for new data
             newArray = ((T[]) new Object[this.size]);

             for (int i = 0; i < this.size - 1; i++) {
                 // copy old data in the element
                 newArray[i] = oldArray[i];
             }
            newArray[this.size - 1] = data;

             // store the reference into elements array
            this.elements = newArray;
         }

    }

    public void addAt(int index, T data){
        T[] newArray;
        T[] oldArray;

        if (this.elements == null){
            this.add(data);
        }
        else if (this.elements != null && this.size >= index && index >= 0){
            // inc. here for prevent the error
            this.size++;

            // store the reference of current array into oldArray
            oldArray = this.elements;

            // create a new array for new data
            newArray = ((T[]) new Object[this.size]);

            for (int i = 0; i < this.size; i++) {
                // copy old data in the element
                newArray[i] = (index > i ? oldArray[i] :
                              (index == i ? data : oldArray[i - 1]));
            }
            newArray[this.size - 1] = data;

            // store the reference into elements array
            this.elements = newArray;
        }


    }

    public void addAll(T[] data){
        int length = data.length + this.size;
        T[] newArray;
        T[] oldArray;

        if (this.elements == null){
           this.elements = data;
        }
        else if (this.elements != null){
            // store the reference of current array into oldArray
            oldArray = this.elements;

            // create a new array for new data
            newArray = ((T[]) new Object[length]);

            for (int i = 0, j = 0; i < length; i++) {
                // copy old data and new data (array of data) in the newArray
                newArray[i] = (i < this.size ? oldArray[i] : data[j]);
                          j = (i < this.size ? j : j + 1);

            }
            // change the size or ArrayList
            this.size = length;

            // store the reference into elements array
            this.elements = newArray;
        }


    }

    public void removeLast(){
        this.size--;
        T[] newArray;
        T[] oldArray;
        if(this.elements != null){
            // store the reference of current array into oldArray
            oldArray = this.elements;

            // create a new array for new data
            newArray = ((T[]) new Object[this.size]);

            for (int i = 0; i < this.size; i++) {
                // copy old data in the element skipping the last element (i < size)
                newArray[i] = oldArray[i];
            }

            // store the reference into elements array
            this.elements = newArray;
        }
    }
    public void removeFirst(){
        this.size--;
        T[] newArray;
        T[] oldArray;
        if(this.elements != null){
            // store the reference of current array into oldArray
            oldArray = this.elements;

            // create a new array for new data
            newArray = ((T[]) new Object[this.size]);

            for (int i = 0; i < this.size; i++) {
                // copy old data in the element skipping the first element
                newArray[i] = oldArray[i + 1];
            }

            // store the reference into elements array
            this.elements = newArray;
        }
    }

    public void removeAt(int index){
        this.size--;
        T[] newArray;
        T[] oldArray;
        if(this.elements != null && this.size >= index && index >= 0){
            // store the reference of current array into oldArray
            oldArray = this.elements;

            // create a new array for new data
            newArray = ((T[]) new Object[this.size]);

            for (int i = 0; i < this.size; i++) {
                // copy old data in the element and skip the index where the targeted element is store
                newArray[i] = (index > i ? oldArray[i] : oldArray[i+1]);
            }

            // store the reference into elements array
            this.elements = newArray;
        }
        else{
            throw new IllegalArgumentException("Size of Array List is " + this.size);
        }
    }

    public T get(int i){
        return  this.elements[i];
    }




}

