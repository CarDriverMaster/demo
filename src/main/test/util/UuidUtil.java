package util;

import java.util.UUID;

public class UuidUtil {

	public static String get32UUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	public static String getAll32UUID() {
		String uuid = UUID.randomUUID().toString().trim();
		return uuid;
	}
	public static void main(String[] args) {
		System.out.println(getAll32UUID());
	}
}

