package pl.javaleader.injcectionspringapp.service;

import org.springframework.stereotype.Service;

@Service
public class PrinterImpl implements Printer {
    @Override
    public String print(String message) {
        return "[log]" + message;
    }
}
