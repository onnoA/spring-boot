package org.springframework.boot.tests.hibernate52.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sun.nio.ch.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <br/>
 *
 * @author onnoA
 * @date 2024/7/25 23:04
 */
@Component
public class ConfigBean {

	@Bean
	public ThreadPoolExecutor threadPool() {
		return new ThreadPoolExecutor(20, 40, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
	}

}
