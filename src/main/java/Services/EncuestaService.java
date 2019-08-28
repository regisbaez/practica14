package arkham.knight.practica13.Services;

import arkham.knight.practica13.Models.Encuesta;
import arkham.knight.practica13.Repositories.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EncuestaService {

    @Autowired
    private EncuestaRepository encuestaRepo;


    public void crearEncuesta(Encuesta encuesta){

        encuestaRepo.save(encuesta);
    }

    public List<Encuesta> listarEncuestas(){

        return encuestaRepo.findAll();
    }

    public Encuesta encontrarEncuestaPorId(long id){

        return encuestaRepo.findEncuestaById(id);
    }

    public void eliminarEncuesta(long id){

        Encuesta encuestaToDelete = encuestaRepo.findEncuestaById(id);
        encuestaRepo.delete(encuestaToDelete);
    }

    public void  borrarTodasLasEncuestas(){

        encuestaRepo.deleteAll();
    }

}
