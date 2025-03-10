
export default function Example1() {
    // =============== JSX문법  ===============  START //
    return (
        <div>
            {/* 주석 내용물 */}
            <h3>컴포넌트</h3>
            {/* 다른 컴포넌트 호출 */}
            <Component1/>
            <Component2/>
            <Component3/>
            <Component4/>
            <Component5/>
            <Component6/>
            <Component7/>
        </div>
    )
    // =============== JSX문법  ===============  END //
} // FE

// (1)
function Component1(props) {
    return <h4>한줄로 입력시 ()생략이 가능</h4>
} // FE

// (2)
function Component2(props) {
    return (
        <div>
            <h4>두줄이상 입력시 ()를 필수로 사용</h4>
        </div>
    );
} // FE

// (3)
function Component3(props) {
    return (
        <>
            <h4>div 대신에 이름없는 마크업 사용이 가능</h4>
        </>
    );
} // FE

// (4)
function Component4(props) {
    const name = "유재석";
    const age = 40;
    const obj = {name : "강호동", age : 50};
    return (
        <>
            <h4>{name}님의 나이 : {age}</h4>
            <h4>{obj.name}님의 나이 : {obj.age}</h4>
        </>
    );
} // FE

// (5)
function Component5(props) {
    const loginState= true; // login 상태
    // JSX 문법 {} 표현식에서는 IF, FOR, FUNCTION, CONST, LET 사용불가!!!!!!!!
    return(
        <div>
               <h4> {loginState ==true ? '로그인중' : '비로그인중'} </h4>
               <h4> {loginState && <p> 로그인 상태일 경우에만 보이는 메시지 </p> } </h4>

        </div>
    )
} // FE

// (6)
function Component6(props) {
    const items = ['사과','딸기','바나나'];
    // JSX 문법 {} 표현식에서는 FOR, FUNCTION, CONST, LET 사용불가!!!!!!!!
    // JSX 문법의 목록(LI,OPTION 등등)표현을 할 경우에는 마크업들에는 KEY 속성이 반 필수적인 요소
    return(<>
        <ul>
               {
                   items.map((item,index) => (
                      <li key={index}>{item}</li>

                   ))
               }
        </ul>
    </>)
} // FE

// (7) 인라인 형식의 CSS 넣기
import'./Example1.css';
function Component7 (props) {
    // style 속성에 style="color:blue" [X]
    // syyle 속성에 { { CSS 객체 } }    [O]
    const cssObj = { color : 'blue' }
    return(<>

        <h4 style={ { color : 'blue' } }>  인라인 형식의 CSS 넣기 </h4>
        <h4 style={ cssObj}> 인라인 형식의 객체 CSS 넣기 </h4>
        <h4 className="myClass"> CSS 파일 내 선택자 이용한 CSS 넣기 </h4>
    </>)
} // FE