package com.example.demo;

import org.redisson.Redisson;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

public class RedissonExample {
    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379"); // Endereço e porta do Redis

        RedissonClient redisson = Redisson.create(config);

        RMap<String, String> map = redisson.getMap("myMap");
        map.put("chave", "valor");
        String valor = map.get("chave");
        System.out.println("Valor obtido: " + valor);

        redisson.shutdown();
    }
}