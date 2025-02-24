package example.day04.task.model.dto;


import lombok.*;

@Getter@Setter@ToString@AllArgsConstructor@NoArgsConstructor // 롬북 (5)
public class BoardDto {
    private int bno;
    private String title;
    private String content;
}
