/*
  입력된 값들의 글자수를 실시간으로 출력하시오.
*/

import { use , useState } from "react"

export default function Task1( ) {
    // (1) 여가에 state 변수 만들기,
    // const [ 변수명 , set 변수명 ] = useState(초기값)
       // - 변수명 : 아무거나.(임의)
       // - set변수명 : set변수명(카멜)
       // ㄴ 새로운 값이라는 기준은 자료의 주소값 변경
       // - =useState( 초기값 ) : 모든 타입의 자료 가능하다.set변수명
       const [ msg , setMsg ] = useState('')

       const [ msgList , setMsgList ] = useState( [] )

       const 저장함수 = (e) => {
           // msgList.push ( msg ); // 입력받은 값이 저장된 state 인 'msg'를 msgList 에 저장

           // 기본타입 자료는 리터럴이라서 그 값 그 자체 -> 기본타입의 자료가 변경되면 그 값 그 자체를 변경
           // 참조타입 ( 포장지 ) 자료는 안에 있는 자료가 변경해도 -> 참조타입 자체는 변경되지 않았다.

           // 예) 가방안에 핸드폰, 지갑 들어있음 | 가방안에 핸드폰 브랜드만 삼성에서 엘지로 변경
           // 복사방법 : 1.map / 2. ...스프레드 연산자 3. pre
           setMsgList( [...msgList , msg] )
           // setMsgList( (msgList) => [ ...msgList , msg ] )

       } // fe

       const handleChange = (e) => {
           setMsg(e.target.value) // [event.target] : input


       } // fe

        console.log( msgList); // 콘솔

        return(
            <>
               <h1> input에 입력하면 실시간으로 글자 수 세기 </h1>
               <input value ={ msg } onChange={ handleChange } />

               <p> 글자 수 : { msg.length } </p>
               <h1> 입력받은 값을 배열에 저장 </h1>

               <button onClick={저장함수} > 저장 </button>

            </>

        )

}