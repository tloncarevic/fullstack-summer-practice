import { deleteHsStudent } from "../components/apiCalls"

export default function HsStudentsApplication ({allHsStudents, onEdit}) {

    return (
        <div>
            {allHsStudents.map(hsStudent=> (
                <div key={hsStudent.hsStudent_id}>
                    <p> 
                        {hsStudent.hsStudent_id}: {hsStudent.firstName} {hsStudent.lastName} ({hsStudent.email})
                        &nbsp;
                        <button onClick={()=>{
                            console.log(hsStudent.hsStudent_id)
                            onEdit(hsStudent.hsStudent_id)
                        }}>Edit</button>
                        &nbsp;
                        <button onClick={()=>{
                            deleteHsStudent(hsStudent.hsStudent_id);
                        }}>Delete</button>
                    </p>
                </div>
            ))}
        </div>
    )
}   
