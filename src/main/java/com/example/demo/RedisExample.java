package com.example.demo;

import redis.clients.jedis.Jedis;

public class RedisExample {
	
	public static final String CHAVE = "chave";
	
    public void execute(int i) {
        Jedis jedis = new Jedis("localhost", 6379); // Endereço e porta do Redis
        jedis.set(CHAVE, "============>" + System.currentTimeMillis());
        
        System.out.println(">>>>> VALOR ENVIADO: " + System.currentTimeMillis());
        System.out.println(">>>>> VALOR RECEBIDO: " + jedis.get(CHAVE));
        
        jedis.close();
    }
}