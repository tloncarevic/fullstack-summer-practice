import { deleteUniStudent } from "../components/apiCalls"

export default function UniStudentsApplication ({allUniStudents, onEdit}) {

    return (
        <div>
            {allUniStudents.map(uniStudent=> (
                <div key={uniStudent.uniStudent_id}>
                    <p> 
                        {uniStudent.uniStudent_id}: {uniStudent.firstName} {uniStudent.lastName} ({uniStudent.email})
                        &nbsp;
                        <button onClick={()=>{
                            console.log(uniStudent.uniStudent_id)
                            onEdit(uniStudent.uniStudent_id)
                        }}>Edit</button>
                        &nbsp;
                        <button onClick={()=>{
                            deleteUniStudent(uniStudent.uniStudent_id);
                        }}>Delete</button>
                    </p>
                </div>
            ))}
        </div>
    )
}   
