<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class lab2 extends CI_Controller {

	public function index()
	{
		$this->load->view('home');
	}

    public function home() {
        $data['title'] = "Home Page";
        $this->load->view('home', $data);
    }

    public function contact_us() {
        $data['title'] = "Contact Us";
        $this->load->view('contact_us', $data);
    }

    public function about_us() {
        $data['title'] = "About Us";
        $this->load->view('about_us', $data);
    }
}
?>
