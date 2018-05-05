package mock.api.v1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mock.output.v1.HelloReply;

@RestController
@RequestMapping(path="/hello", produces = {MediaType.APPLICATION_JSON_VALUE})
public class Hello {

    @GetMapping("/{name}/{number}")
    @ApiOperation(value = "Obter dados do comprovante de TED")
    @ApiResponses(@ApiResponse(code = 200, message = "Success", response =  HelloReply.class, responseContainer="List"))    
    public List <HelloReply> index(@PathVariable String name, @PathVariable Integer number) {
        List<HelloReply> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(new HelloReply(name, i));
        }
        return list;
    }
    
}
