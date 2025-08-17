void OrderedList::display(){
     node *p = new node;
     p = first;
          while(p != NULL){
                  cout << p -> data << " ";
                  p = p -> link;
                  }
          cout << endl;
}

int OrderedList::remove(int value){
    node *p = new node;
    p = first;
    node *before = p;
    while(p != NULL){
            if(first->data == value){
                           before = first;
                           first = first ->link;
                           delete before;
                           break;
                           return 0;
                           }
            before = p;
            p= p->link;
            if(p->data == value){
                       before->link = p->link;
                       delete p;
                       break;
                       return 0;
                       }
            
            }
    return -1;
}

OrderedList::node* OrderedList::search(int value){
    node *p = new node;
    p = first;
    while(p != NULL){
            if(p->data == value){
                       cout <<"here";
                       return p->link;
                       }
            p = p ->link;
            }
    cout << "The element searched has not been found." << endl;
    
    }

OrderedList::ostream &operator<<( ostream &output, const OrderedList& Olist){
        node *p;
        for(p = Olist; p != 0; p = p -> link){
              output << p -> data << endl;
}
        
        return output;
}