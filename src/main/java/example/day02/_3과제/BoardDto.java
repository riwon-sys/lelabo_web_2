package example.day02._3과제;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor // 롬복5개 사용
public class BoardDto {
      private  int bno;
      private String title;
      private String content;

}
