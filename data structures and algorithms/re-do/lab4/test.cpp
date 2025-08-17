#include <iostream>

using namespace std;

class OrderedList{
      friend ostream &operator<<( ostream&, const OrderedList& );
      
      private:
              struct node{
                     int data;
                     node *link;
                     };
              node *first, *last;
              int count;
      public:
             OrderedList();
             ~OrderedList();
             void insert(int);
             void display();
             int remove(int);
             node* search(int);
             //<<
      
};

OrderedList::OrderedList(){
                           
                           first = NULL;

}

OrderedList::~OrderedList(){
                            while(first != NULL){
                                      node *destruct;
                                      destruct = first;
                                      first = first -> link;
                                      delete destruct;
                            }
                            delete first;
                            cout << "Destructor called";                        
}

void OrderedList::insert(int value){

                    node *NewNode = new node;
                    NewNode -> data = value;
                    NewNode -> link = NULL;
                    
                    node *p = new node;
                    p = first;
                    
                    node *before = p;

                    if(first == NULL){
                            first = NewNode;
                                 }
                    else{
                         while(p != NULL){
                                 
                                 if(value < first->data){
                                            NewNode -> link = first;
                                            first = NewNode;
                                            break;
                                            }
                                 else if(p -> data >= value){
                                      NewNode -> link = before -> link;
                                      before -> link = NewNode;
                                      break;
                                      }
                                      before = p;
                                      p = p -> link;
                                 if(p == NULL){
                                      before -> link = NewNode;
                                      }
                                 }
                         
                         
                         }
}

        

int main(){
    OrderedList list;
    list.insert(-1);
    list.insert(7);
    list.insert(2);
    list.insert(1);
    list.insert(6);
    list.insert(-9);
    
    list.display();
    list.remove(7);
    list.remove(-9);
    list.remove(1);
    
    cout << endl << list.search(7);
    
    cout << list;
    
    system("pause");
    return 0;
    }
