package com.jieshun.api.test;



public class test implements Runnable{

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 10; i++) {

			new Thread(new test()).start();

			Thread.sleep(100);

		}

	}



	@Override

	public void run() {

		try {

			new TestDemo().testcreateOrderByCard();
			Thread.sleep(100);
			
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}

