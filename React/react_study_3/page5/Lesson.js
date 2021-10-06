import React from 'react';

class Lesson extends React.Component {
  render() {
    return (
      <div className='lesson-card'>
        <div className='lesson-item'>
          <p>{this.props.name}</p>
          <img src={this.props.image} />
        </div>
        {/* Prepare the modal */}
        <div className='modal'>
          <div className='modal-inner'>
            <div className='modal-header'></div>
            <div className='modal-introduction'>
              {/* Display the lesson name */}
              <h2>{this.props.name}</h2>
              
              {/* Display the lesson introduction */}
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
