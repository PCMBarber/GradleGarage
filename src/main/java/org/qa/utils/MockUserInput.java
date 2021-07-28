package org.qa.utils;

public class MockUserInput extends UserInput {
		
		@Override
		public String getString() {
			return null;
		}
		
		@Override
		public int getInt() {
			return 0;
		}
}
