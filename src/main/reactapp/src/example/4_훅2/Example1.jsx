import { useEffect, useState } from "react"

// [ ] component

export default function Example1 (props) {


    // (1) 의존성 배열이 없을 경우의 useEffect 함수 사용시 | 실행 시점 1.출생(최초실행)
    // : import {useEffect} from "react"
    // useEffect( 이벤트 함수정의 , 의존성배열)
    useEffect( () => {
        console.log('이펙트 함수 실행')
    }) // [] 의존성 배열이 없을 경우 ! ! !

    // (2)  의존성 배열이 빈 배열일 경우의 useEffect 함수 사용시 | 실행 시점 1.출생(최초실행)
    useEffect( ()=> {
        console.log('이펙트 함수 실행2')
    },[]) // // [] 의존성 배열이 빈 배열일 경우 ! ! ! 딱 한번만 실행됨

    // (3) 의존성 배열에 state 변수가 존재할 경우 useEffect 함수 사용시 | 실행 시점 1.출생(최초실행) 2. 삶(리렌더링)
       // -> 차이점 : 의존성배열에 존재하는 state변수가 변경될때만 재실행이 된다. ,
       //            의존성배열에 존재하지 않는 state변수가 변경될때는 재실행이 안된다.
    const[ count , setCount ] = useState( 0 );
    useEffect( () => {
        console.log( '이펙트 함수 실행3' )
    }, [ count ] ) // [] 의존성 배열에 state 변수가 있을 경우 ! ! !

    const [ count2 ,setCount2 ] = useState( 0 );


    return (<>

    <button onClick={ (e) => { setCount( count+1 ) } } > 업데이트1 1번/3번 useEffect 실행 </button>
    <button onClick={ (e) => { setCount2( count2+1 ) } } > 업데이트2 1번 useEffect 실행 </button>
    </>)
}