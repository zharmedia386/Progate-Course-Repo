import React from 'react';

class Lesson extends React.Component {
  // Declare the constructor
  constructor(props) {
    super(props);
    // Declare the initial value of state
    this.state = {isModalOpen:false};
    
  }
  
  render() {
    return (
      <div className='lesson-card'>
        <div className='lesson-item'>
          <p>{this.props.name}</p>
          <img src={this.props.image} />
        </div>
        <div className='modal'>
          <div className='modal-inner'>
            <div className='modal-header'></div>
            <div className='modal-introduction'>
              <h2>{this.props.name}</h2>
              <p>{this.props.introduction}</p>
            </div>
            <button className='modal-close-btn'>
              Close
            </button>
          </div>
        </div>
      </div>
      
    );
  }
}

export default Lesson;
