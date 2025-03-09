import {Component} from 'react'

class ClassProps extends Component{

    state={eid:10,ename:"Ramesh",esal:12948,eadd:"india"}

    render(){
        return(<div>

            <Test id={this.state.eid} name={this.state.ename} sal={this.state.esal} add="Hyderabad"/>

        </div>);
    }
}



class Test extends  Component{

    render(){
        return(<div>
            
            <p>eid:- {this.props.id}</p>

            <p>ename:-{this.props.name} </p>

            <p>esal:-{this.props.sal} </p>

            <p>eadd:-{this.props.add}</p>

        </div>);
    }

}

export default ClassProps;