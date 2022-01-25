//
//A fairly simple arraylist implementation extending custom list interface.
//Default size is 2, grows by size * 2 when needed.
//When an element is added or removed at an index other elements are not re-arranged.
//
//@param <e>

public class CustomArrayList<E> implements CustomListInterface<E> {
    private Object[] array;
    private int size;
    private int maxSize;
    private int lastArrayObject;
    private int n;

//
//Default constructor, creates an empty underlying array with maxSize 2
//
    public CustomArrayList() {
        maxSize = 2;
        size = 0;
        array = new Object[maxSize];
    }

    //don't have bolucks idea how that is different from the other instruction

//
//Sized constructor, creates an empty object with maxSize size
//@param size the initial size of the underlying array
//
    public CustomArrayList(int size) { //$$$$$$$$ IS THIS SUPPOSE TO BE THE LENGTH IMITATOR
        maxSize = size;
        size = 0;
        array = new Object[size];
    }

//
//Element list constructor, takes in variable number of objects and creates an underlying
//array large enough to fit them.
//@param e
//
    public CustomArrayList(E ...e) {
        maxSize = size = e.length;
        array = new Object[size];

        for (int i = 0; i < size; ++i) {
            array[i] = e[i];
        }
    }


//
//Adds an object to the underlying array after all previously added objects.
//If array needs to grow, it invokes grow method.
//@param o object to be added
//
    @Override
    public void add(Object o) {

        //GROW CHECK
        if (size <= maxSize) {
            System.out.println("No need to make the array grow");
        } else if (size >= maxSize) {
            growArray();
            System.out.println("growArray has been invoked because not enough space");
        }

        int totalArrayLength = array.length; //DETERMINES THE TOTAL DISTANCE OF THE ARRAY

        o = array[totalArrayLength + 1]; //THIS WILL TAKE THE MOST BACKEND OF THE ARRAY

        //the other way of going it
//            //set N with the add(function)
//            //there is a rotation of the array objects
//            for (int i = 0; i < size; i++) {
//                int k, lastArrayObject;
//            }
//
//        lastArrayObject = array[array.length-1];
//            for (int k = array.length - 1; k > 0; k--) {
//                array[k] = array[k - 1];
//            }
//
//            array[0] = lastArrayObject;
//
    }
//
//Adds object at specified index, advancing the size of the underlying array. This will
//require us to shift all later elements further down the index order
//@param index index location where object will be inserted
//@param e element to be inserted
//@throws IndexOutOfBoundsException
//
    @Override
    public E add(E e, int index) throws IndexOutOfBoundsException {

        if (size <= maxSize) {
            System.out.println("No need to make the array grow");
        } else if (size >= maxSize) {
            growArray();
            System.out.println("growArray has been invoked because not enough space");
        }

        for (int i = 0; i < array.length; i++) {
            array[index] = array[i];    //IT GOING TO MATCH THAT TFGTB
            array[i+1] = int temp;      //TAKE THE NEXT POSITION OUT IN TEMP
            array[index] = array[i+1];  //REPLACE THE NEXT WITH THE NEW VARIABLE
            array[i + 1] = array[i];
            if(array[i] ) { // a statement similar to the bubble sorting


            }

        }


//        for (int i = 0; i < array.length; i++) {
//            if(array[index] == array[i]) {
//
//                //STORE IN TEMP AND SINGLE IT OUT
//                int temp = (int) array[index];
//
//                //CREATE A NEW ARRAY WITHOUT IT
//                int array[] = new int[size - 1];
//
//            } else {
//                array = null;
//            }
//            //I'm sure I have to return something
//        }
//
//    }

//
//gets the object located at supplied index
//@param index index of object to get
//@return object located at index
//@throws IndexOutOfBoundsException
//


    @Override
    public E get(int index) throws IndexOutOfBoundsException {

        Object o = array[index];
        return (E) o; //casting >>> memorize this its like parsing but with generic with
    }

//
//Emptys the underlying array by setting it's private reference to null and allowing
//the old array to be garbage collected.
//
    @Override
    public void clear() {
        //Implement this method
        return 0;
    }

//
//Check if object o is found within underlying array, using Object.equals() method
//@param o object to search for
//@return index location of first instance of matching object. -1 if not found.
//
    @Override
    public int contains(Object o) { //will need to use a forloop with matches for this
        //Implement this method
        return 0;//leave something like this as a placeholder, and fix it later
    }


//Removes object at specified index from underlying array, we will then
//need to shift the remaining elements up in the index order to fill in the gap
//@param index index of object to remove from array

    @Override
    public void remove(int index) {

        //GROW CHECK
        if (size <= maxSize) {
            System.out.println("No need to make the array grow");
        } else if (size >= maxSize) {
            growArray();
            System.out.println("growArray has been invoked because not enough space");
        }

        //GET THE INDEX OF THE ITEM IN THE ARRAY TO BE REMOVED
        //REMEMEBR TO CAST IT

        for (int i = 0; i < array.length; i++) {
            if(array[index] == array[i]) {

                //STORE IN TEMP AND SINGLE IT OUT
                int temp = (int) array[index];

                //CREATE A NEW ARRAY WITHOUT IT
                int array[] = new int[size - 1];

            } else {
                array = null;
            }
        //I'm sure I have to return something
        }

        //Extra NOTES:
        //arr = removeTheElement(arr, index);
    }

        //MAKE THE REMOVED VALUED NULL AND SHIFT IT DOWN

//returns size of array. This is the one greater than the index of the most advanced stored object,
//not the maxSize which controls growth of the underlying array.
//@return one greater than index of most advanced stored object

    @Override
    public int size() {

        return size;
    }


//Doubles the size of the underlying array by creating a new array and copying the
//contents of the previous array into it.
    private void growArray(){
        //System.out.println("Growing Array from " + maxSize + " to " + maxSize * 2);
        //set up new array
        maxSize = maxSize * 2;
        Object[] tempArray = array;
        array = new Object[maxSize];

        //copy to new array
        for (int i = 0; i < size; i++) {
            array[i] = tempArray[i];
        }
    }
}
