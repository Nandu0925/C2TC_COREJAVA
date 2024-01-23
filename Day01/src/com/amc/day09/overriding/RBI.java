package com.amc.day09.overriding;

public class RBI {
		public float getRateOfInterest() {
			return 6.7f;
		}

	}
	class SBI extends RBI{
		@Override
		public float getRateOfInterest() {
			return 8.0f;
		}
	}
	class HDFC extends RBI{
		@Override
		public float getRateOfInterest() {
			return 15.0f;
		}
	}
	class ICICI extends RBI{
		@Override
		public float getRateOfInterest() {
			return 9.0f;
		}
	}


