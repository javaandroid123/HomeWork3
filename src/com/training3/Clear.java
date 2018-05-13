package com.training3;

public class Clear {
		int a;
		String b;

		public void setData(int c, String d) {
			a = c;
			b = d;
		}

		public void showData() {
			System.out.println("Data a = " + a);
			System.out.println("Data b = " + b);
			System.out.println("------------");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Clear cl1 = new Clear();
			Clear cl2 = new Clear();

			cl1.setData(10, "Pham Hoang");
			cl2.setData(20, "Huong Lan");

			cl1.showData();
			cl2.showData();
	//khai báo biến cl3 và gán cho giá  trị của cl2
			Clear cl3 = new Clear();
			cl3 = cl2;
			cl3.showData();
	//xóa cl2
			cl2 = null;
			cl3.showData();
	//xóa cl3
			cl3 = null;
	//		cl3.showData(); //vì cl3 đã bị xóa nên không thể đưa ra cl3
		}

	}


