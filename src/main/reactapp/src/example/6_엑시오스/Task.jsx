import { useEffect, useState } from "react"

import axios from 'axios';

export default function Task( props ){
     const [ formData , setFormData ] = useState( { name:'' , phone : '' } )
     const formDataChange = (e)=>{
             console.log( e.target );
             console.log( e.target.name );
             console.log( e.target.value );

             setFormData( {...formData , [e.target.name] : e.target.value } );
     }

     // [3] 현재 state 변수를 스프링 서버에게 보내기 , AXIOS
         const onPost = async ( e ) => {
             try{
                 const response = await axios.post('http://localhost:8080/day07Task/task' , formData ); // state변수를 axios로 보내기
                 if( response.data == true ){ // 만약에 등록 응답이 TRUE 이면
                     alert('번호등록성공');  // 알림
                     setFormData({ name:'' , phone : ''  }); // state 초기화
                     onFindAll(); // 등록 성공하면 자료 렌더링
                 }else{
                     alert('번호등록실패');
                 }
             }catch( error ){ console.log( error ); }
         }
     // [4]
     return (<>
             <div>
                 <h1> 번호등록부 </h1>
                 <form>
                     성함 : <input type="text" value={ formData.name } name='name' onChange={ formDataChange }  /> <br/>
                     연락처 : <input type="text" value={ formData.phone } name='phone' onChange={ formDataChange }  /> <br/>

                     <button type="button" onClick={ onPost }> 등록 </button>
                 </form>
             </div>
     </>)

}