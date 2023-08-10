package pl.kalksztejn.mateusz.httpmethodstester.service.Interface;

import reactor.core.publisher.Mono;

public interface MathService {
    String calculateSqrt();

    String calculateFactorial();

    String blockingMethod(int threadPool);
}
