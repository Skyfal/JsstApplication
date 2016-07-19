package com.jieshun.api.test;



public class test implements Runnable{

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 10; i++) {

			new Thread(new test()).start();

			Thread.sleep(1000);

		}

	}



	@Override

	public void run() {

		try {
			while(true){
				
				new TestDemo().testcreateOrderByCard1();
				Thread.sleep(100);
				
			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
