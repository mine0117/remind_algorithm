package sorting_algorithm;

import java.util.*;

class Node { // Ʈ���� ��� ������ ������ Ŭ���� ����ü
	int data; // ��� ��
	Node left; // ���� �ڽ� ��� ���� ��
	Node right; // ������ �ڽ� ��� ���� ��

	// �߰��� �� �����Ǵ� ����, ������ �ڽ��� ���� �𸣴ѱ� �ϴ� data ���� ������� Node ��ü ����
	Node(int data) {
		this.data = data;
	}
}

public class binaryTree {
	public Node root; // �ʱ� root�� null

	public void createNode(int data, int leftData, int rightData) {
		if (root == null) { // �ʱ� ���� - ��Ʈ ��� ����
			root = new Node(data);

			// �¿� ���� �ִ� ���, �� -1�� �ƴ� ��� ��� ����
			if (leftData != -1) {
				root.left = new Node(leftData); // ���� �ڽ� ��� ���� ������ Node �ν��Ͻ� ����
			}
			if (rightData != -1) {
				root.right = new Node(rightData); // ������ �ڽ� ��� ���� ������ Node �ν��Ͻ� ����
			}
		} else { // �ʱ� ���°� �ƴ϶��, ��Ʈ ��� ���� ���� ������� ��� �� ������� ã�ƾ���
			searchNode(root, data, leftData, rightData);
		}
	}

	// �Ű������� ���� root��带 �������� data�� ���� ���� ���� node�� ã�´�.
	// ã�� ������ root��忡�� ���� ����, ���������� ������
	public void searchNode(Node node, int data, int leftData, int rightData) {
		if (node == null) { // ������ ��尡 null�̸� ��� ���� - ã��(������) ��� X
			return;
		} else if (node.data == data) { // �� ��ġ�� ã�Ҵٸ�
			if (leftData != -1) { // -1�� �ƴ϶� ���� �ִ� ��쿡�� �¿� ��� ����
				node.left = new Node(leftData);
			}
			if (rightData != -1) {
				node.right = new Node(rightData);
			}
		} else { // ���� ã�����߰� Ž���� ��尡 ���� �ִٸ�
			searchNode(node.left, data, leftData, rightData); // ���� ��� Ž��
			searchNode(node.right, data, leftData, rightData); // ������ ��� Ž��
		}
	}

	// ������ȸ Preorder : Root -> Left -> Right
	public void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			if (node.left != null)
				preOrder(node.left);
			if (node.right != null)
				preOrder(node.right);
		}
	}

	// ���� ��ȸ Inorder : Left -> Root -> Right
	public void inOrder(Node node) {
		if (node != null) {
			if (node.left != null)
				inOrder(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				inOrder(node.right);
		}
	}

	// ������ȸ Postorder : Left -> Right -> Root
	public void postOrder(Node node) {
		if (node != null) {
			if (node.left != null)
				postOrder(node.left);
			if (node.right != null)
				postOrder(node.right);
			System.out.print(node.data + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		binaryTree t = new binaryTree();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			t.createNode(a, b, c);
		}

		System.out.println("���� ��ȸ");
		t.preOrder(t.root);

		System.out.println("\n���� ��ȸ");
		t.inOrder(t.root);

		System.out.println("\n���� ��ȸ");
		t.postOrder(t.root);
	}

}
