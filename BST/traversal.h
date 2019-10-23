//Structure Defenitions...

//Node - Each node stores an integer value and has a left sub node and a right sub node...
struct Node{
	char data;
	struct Node* left;
	struct Node* right;
	int height;
};
typedef struct Node* Nodeptr;

void inorder_rec(Nodeptr root);
void preorder_rec(Nodeptr root);
void postorder_rec(Nodeptr root);

//This function recursively traverses and prints the elements of the tree in inorder fashion...
void inorder_rec(Nodeptr root){
	if(root){
		inorder_rec(root->left);
		printf("%d  ",root->data);
		inorder_rec(root->right);
	}
}
//End of function...

//This function recursively traverses and prints the elements of the tree in preorder fashion...
void preorder_rec(Nodeptr root){
	if(root){//If root is not NULL
		printf("%d  ",root->data);
		preorder_rec(root->left);
		preorder_rec(root->right);
	}
}
//End of function...

//This function recursively traverses and prints the elements of the tree in postorder fashion...
void postorder_rec(Nodeptr root){
	if(root){//If root is not NULL
		postorder_rec(root->left);
		postorder_rec(root->right);
		printf("%d  ",root->data);
	}
}
//End of function...


