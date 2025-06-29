package test.example.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.example.domain.Temp;
import test.example.repository.TempRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TempService {

    private final TempRepository tempRepository;

    public Temp getHello(Long id){
        Optional<Temp> tmp = tempRepository.findById(id);
        return tmp.orElse(null);
    }

    public void addTemp(String name){
        Temp tmp = new Temp();
        tmp.setName(name);
        tempRepository.save(tmp);

    }
}
