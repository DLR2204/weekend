import {Component} from 'react'

class Calculator extends Component{

    state ={a:20,b:15}


    setA=(e)=>{
        this.setState({a:parseInt(e.target.value)})
    }

    setB=(e)=>{
        this.setState({b:parseInt(e.target.value)})
    }

    render(){
        return(
            <div>

                <h1><u>Calculator Application</u></h1>
                    <h1>

               A:- <input type="text" className='inputA' placeholder={this.state.a} onChange={this.setA}/>

                B:-<input type="text" className='inputB' placeholder={this.state.b} onChange={this.setB}/><br/><br/>




                {'A:-' +this.state.a}<br/>{'B:-' +this.state.b}<br/>

                {'Addition:- ' + (this.state.a + this.state.b)}<br/>

                {'Subraction:-'+(this.state.a-this.state.b)}<br/>

                {'Multiplication:- '+(this.state.a*this.state.b)}<br/>

                {'Division:- '+(this.state.a/this.state.b)}<br/>

                </h1>

            </div>
        );
    }

}

export default Calculator;