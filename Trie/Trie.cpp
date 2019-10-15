#include<bits/stdc++.h>
using namespace std;

struct Trie {
    char data;
    bool isLeaf;
    Trie* child[];
};
Trie* getNode(){
    Trie* temp = new Trie();
    for(int i=0;i<26;i++){
        temp->child[i] = NULL;
    }
    temp->isLeaf = false;
    return temp;
}

void insert(Trie* root,string s){
    Trie* temp = root;
    for(int i=0;i<s.size();i++){
        int idx = s[i] - 'a';
        if(temp->child[idx] == NULL){
            temp->data = s[i];
            temp->child[idx] = getNode();
        }
        temp = temp->child[idx];
    }
    temp->isLeaf = true;
}

bool search(Trie* root, string s){
    Trie* temp = root;
    for(int i=0;i<s.size();i++){
        int idx = s[i] - 'a';
        if(temp->data = s[i]){
            temp = temp->child[idx];
        }
    }
    if(temp->isLeaf){
        return true;
    } else {
        return false;
    }
}

int main(){
    Trie* root = getNode();
    insert(root,"boat");

    if(search(root,"boa"  )){
        cout<<"found";
    } else {
        cout<<"not found";
    }
    return 0;
}
