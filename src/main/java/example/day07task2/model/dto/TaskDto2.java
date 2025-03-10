package example.day07task2.model.dto;

import lombok.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto2 {
    private int pno;
    private String pname;
    private String pphone;
}
